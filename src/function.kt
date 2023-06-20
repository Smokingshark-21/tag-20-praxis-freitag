import kotlin.concurrent.thread

fun returnKontobetrag(kontInhaber:String):String{ // In dieser fun wird der Kontostand zurück gegeben von dem KontoInhaber
    try {

        return "Ihr Kontostand bertägt:${konten[kontInhaber]!!}€"
    }catch (e:Exception){
        return "Dieses Konto ist nicht vorhanden"
    }
}


fun returnAddkonto(Kontoinhaber:String,Kontostand:Double):String{ // In dieser fun wird ein neuer user zur Map Hinzugefügt

    if (konten.containsKey(Kontoinhaber) ){
        return "Dieses Konto ist Vorhanden versuche es mit einem anderem namen"
    }else{
        konten[Kontoinhaber]=Kontostand
        return "Ihr Konto wurde erfolgreich hinzugefügt"
    }
}


fun removekonto(Kontoinhaber: String){   // In dieser fun wird ein user entfernt aus der Map

    if (konten.containsKey(Kontoinhaber)){
        println("Möchten sie wirklich ihr Konto löschen Ja/Nein")
        val abfrage = readln()

        when(abfrage){
            "Ja","ja" ->{ println("Ihr Konto: [$Kontoinhaber] wurde erfolgreich gelöscht ")
                            konten.remove(Kontoinhaber) }
            "Nein","nein" -> println("Ihr Konto wird nicht Gelöscht schönen Tag noch")
        }
    }else{
        println("Dieses Konto ist nicht vorhanden")
    }
}

fun payment(Kontoinhaber: String,Betrag:Double){
    if (konten.containsKey(Kontoinhaber)){
        if (Betrag <= 500 ){
            if (Betrag <= konten[Kontoinhaber]!!) {
                konten[Kontoinhaber] = konten[Kontoinhaber]!! - Betrag
                println("Entnehmen sie Ihren betrag: $Betrag aus dem Geldfach ")
            }else{
                println("Ihr Aktueler Kontostand reicht nicht aus für diese abbuchung")
            }
        }else{
            println("Das Maximale Auszahlungs limit pro abhebung Beträgt: 500€")
        }
    }else{
        println("Dieses Konto ist nicht vorhanden")
    }
}

fun deposit(Kontoinhaber: String,Betrag: Double){
    if (konten.containsKey(Kontoinhaber)){
        konten[Kontoinhaber]=konten[Kontoinhaber]!!+Betrag
        println(returnKontobetrag(Kontoinhaber))
    }else{
        konten[Kontoinhaber]=Betrag
        println("Es wurde ein neues konto eingerichtet\n$Kontoinhaber ${konten[Kontoinhaber]}€")
    }
}

fun inBanktransfer(vonKonto:String,zuKonto:String,Betrag: Double){
    if (konten.containsKey(vonKonto) && konten.containsKey(zuKonto)){
        if (konten[vonKonto]!! >= Betrag){
            konten[vonKonto]=konten[vonKonto]!!-Betrag
            konten[zuKonto]=konten[zuKonto]!!+Betrag
            println("Der Betrag von $Betrag€ wurde erfolgreich überwiesen")
        }
    }else if (konten.containsKey(vonKonto)){
        println("Das Konto von dem aus überwiesen werden soll ist nicht vorhanden")
    }else{
        println("Das Empfänger Konto ist nicht vorhanden")

    }
}

fun jahreszinsCalculator(Kontoinhaber: String){

    if (konten.containsKey(Kontoinhaber)){
        if (konten[Kontoinhaber]!!-kontoführungskosten >= kontoführungskosten*12){
            konten[Kontoinhaber]=((konten[Kontoinhaber]!!-kontoführungskosten*12)/100*zinsatz)+(konten[Kontoinhaber]!!-kontoführungskosten*12)
            println(konten[Kontoinhaber])
        }else{
            konten.remove(Kontoinhaber)
            println("Ihr konto wurde Entfernt aufgrund unzureichender deckung")
        }
    }else{
        println("Dieses Konto: $Kontoinhaber ist nicht Vorhanden")
    }
}

fun logIn(){
    println("Geben sie ihren Konto Namen ein")
    val a = readln()
    if (kontenPasswort.containsKey(a) && konten.containsKey(a)){
        logInpass()
        loginKonto=a
        menu()
    }else {println("Konto $a konnte nicht gefunden werden.\n")
           logIn()}
}

fun logInpass(){
    println("Geben sie ihr Passwort ein")
    val b = readln()
    if (kontenPasswort.containsValue(b)){
        println("Sie sind erfolgreich eingelogt")
    }else logInpass()
}

fun logOut(){
    println("Möchten sie sich wirklich auslogen [Ja/Nein]")
    val a = readln()
    when(a){
        "Ja","ja" -> {
            loginKonto=""
            println("Sie wurden erfolgreich ausgelogt")
        }
        "Nein","nein" -> {
            returnTomenu()}
    }

}
fun menu(){
    println("Wilkommen $loginKonto\n")
    Thread.sleep(3000)
    println("Wähle eine Option aus\n")
    println("[1] Kontostand\n[2] Auszahlen\n[3] Einzahlen\n[4] Überweisen\n[5] Auslogen")
    val a = readln().toInt()

    when(a){
        1 -> {println(returnKontobetrag(loginKonto))
              returnTomenu()
        }
        2 -> {
            println("Wie viel möchten sie abheben")
            val b = readln().toDouble()
            println()
            payment(loginKonto,b)
            returnTomenu()
        }
        3 -> {
            println("Wie viel möchten sie einzahlen")
            val c = readln().toDouble()
            println()
            deposit(loginKonto,c)
            returnTomenu()
        }
        4 -> {
            println("An wen möchten sie überweisen")
            val d = readln()
            println("Wie viel möchten sie Überweisen")
            val e = readln().toDouble()
            inBanktransfer(loginKonto,d,e)
            returnTomenu()
        }
        5 -> {logOut()}
    }
}

fun returnTomenu(){
    println("\nZurück zum menu [Ja/Nein]")
    val a = readln()
    when(a){
        "Ja","ja" -> menu()
        "Nein","nein" -> {Thread.sleep(2000)
                          returnTomenu()}
    }
}