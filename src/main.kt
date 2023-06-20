fun main(){
    println(returnKontobetrag("Max"))//Kontostand eines bestehenden Kontos ausgeben.
    println()
    println(returnKontobetrag("Luckas"))//Fehlermeldung, wenn versucht wird, den Kontostand eines nicht existierenden Kontos auszugeben.
    println()
    println(returnAddkonto("Luckas",200.00))//Ein neues Konto erstellen.
    println()
    println(returnAddkonto("Max",300.33))//Fehlermeldung, wenn versucht wird, ein neues Konto zu erstellen, obwohl der Name bereits vergeben ist.
    println()
    removekonto("Mike")//Ein bestehendes Konto löschen.
    println()
    removekonto("Jonas")//Fehlermeldung, wenn versucht wird, ein nicht existierendes Konto zu löschen.
    println("-----------Auszahlung-----------\n")
    payment("Martin",30.00)//Einzahlung wird getätigt
    println()
    payment("Max",30.00)
    println()
    payment("Luckas",30.00)
    println()
    payment("Valeria",30.00)
    println()
    payment("Sonja",30.00)
    println("-----------Einzahlung-----------\n")
    deposit("Martin",30.00)//Auszahlung wird getätigt
    println()
    deposit("Max",30.00)
    println()
    deposit("Luckas",30.00)
    println()
    deposit("Valeria",30.00)
    println()
    deposit("Sonja",30.00)
    println("-----------Überweisung-----------\n")
    inBanktransfer("Max","Valeria",200.30)
    println()
    println("Max:${returnKontobetrag("Max")}\nValeria:${returnKontobetrag("Valeria")}\n----------------------")
    inBanktransfer("Sonja","Martin",50.00)
    println()
    println("Sonja:${returnKontobetrag("Sonja")}\nMartin:${returnKontobetrag("Martin")}\n----------------------")
    inBanktransfer("Martin","Max",25.00)
    println()
    println("Martin:${returnKontobetrag("Martin")}\nMax:${returnKontobetrag("Max")}\n----------------------")
    println("-----------Jahreszins-----------\n")
    println(jahreszinsCalculator("Max"))

}