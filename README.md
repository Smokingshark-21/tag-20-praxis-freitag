# **Grundlagen der Programmierung**

**Verzweigungen**

**Beschreibung:**

Willkommen zurück zu den Tagesaufgaben von Tag 20!

Heute üben wir nicht nur das Arbeiten mit Verzweigungen, sondern auch weiterhin das Schreiben und Aufrufen von unseren eigenen Funktionen.

Dafür programmieren wir heute unsere eigene Bank!

**Hinweise zur Bearbeitung:**

- Achte darauf deinen Code stets sorgfältig zu kommentieren
- Wenn du bei einer Aufgabe nicht weiter kommst, mach eine kurze Pause oder probier dich bei einer anderen Aufgabe.
- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Bearbeitet eure Aufgaben in der Datei `Bank`, die sich im `src` befindet

---

**Aufgabe 1 - Die Bank initialisieren**

<details>

- Erstellt eine globale Konstante (d.h. außerhalb der main()-Funktion) vom Typ MutableMap\<String, Double\>. Diese MutableMap repräsentiert unser Register von allen Konten in der Bank. Ein Konto besteht aus dem Namen eines Kontoinhabers und einem Geldbetrag. Als Key soll also der Name der Kontoinhaber und als Value der Geldbetrag der Kontoinhaber gespeichert werden. Lege mindestens 5 verschiedene Konten in der MutableMap an, die Namen der Kontoinhaber und die Geldbeträge könnt ihr frei wählen.

</details>

 --- 
  
**Aufgabe 2 - Konto Geldbetrag**

<details>

- Schreibe eine Funktion, die den aktuellen Betrag eines Kontos zurückgibt.
- Nutze einen Parameter, um der Funktion zu sagen, wessen Kontostand zurückgegeben werden soll. Wenn es das Konto in unserer Bank nicht gibt, soll eine entsprechende Warnung in der Konsole ausgegeben werden! Der Rückgabewert der Funktion sollte der aktuelle Kontostand sein.

</details>

---

**Aufgabe 3 - Neue Konten hinzufügen**

<details>

- Schreibe eine Funktion, die ein neues Konto zur Bank hinzufügt. Diese Funktion sollte sowohl den neuen Kontoinhaber, als auch den Kontostand als Parameter erhalten.
- Überprüfe zuerst, ob bereits ein Konto mit dem angegebenen Namen existiert. In diesem Fall sollte das alte Konto nicht überschrieben werden. Überlegt euch also eine Lösung für dieses Problem. Zeige dem Benutzer an, ob das neue Konto erfolgreich angelegt wurde (D.h. gib eine entsprechende Nachricht in der Konsole aus.).

</details>

 --- 
  
**Aufgabe 4 - Konto löschen**

<details>

- Schreibe eine Funktion, die ein bestehendes Konto entfernt. Nutze als Parameter einen Namen, um ein bestimmtes Konto auszuwählen. Dieser soll aus der Map mit unseren Konten entfernt werden.
- Überprüfe zuerst, ob bereits ein Konto mit dem angegebenen Namen existiert. Gibt es das Konto in der Bank nicht, soll eine entsprechende Warnung angezeigt werden.
- Zeige dem Benutzer an, ob das Konto erfolgreich gelöscht wurde.

</details>

---

**Aufgabe 5 - Auszahlung am Geldautomat**

<details>

- Schreibe eine Funktion, die eine Auszahlung am Geldautomaten simuliert. Nutze einen Parameter, um das richtige Konto auszuwählen und einen weiteren für den Geldbetrag, der abgehoben werden soll.
- Berechne dann den neuen Kontostand und speichert ihn auf dem Konto ab.
- Überprüfe zuerst, ob ein Konto mit dem angegebenen Namen existiert. Gibt es das Konto nicht, soll eine Warnung in der Konsole ausgegeben werden.
- Überprüfe ebenfalls, ob das Konto über einen ausreichenden Kontostand verfügt, um den Geldbetrag auszahlen zu können. Schreibe die Funktion so, dass maximal 500 Euro pro Transaktion abgehoben werden können. Wenn die Transaktion mehr als 500 Euro beträgt, soll eine Warnung ausgegeben und die Transaktion abgebrochen werden.

</details>

--- 
  
**Aufgabe 6 - Einzahlung am Geldautomaten**

<details>

- Schreibe eine Funktion, die eine Einzahlung am Geldautomaten simuliert. Nutze einen Parameter, um das richtige Konto auszuwählen und einen weiteren für den Geldbetrag, der eingezahlt werden soll.
- Berechne den neuen Kontostand und speicher ihn in dem Konto ab. Existiert das Konto nicht, soll ein neues Konto angelegt werden. In diesem Fall teile es dem Nutzer des Programms mit, dass ein neues Konto angelegt wurde. Der Kontostand des neuen Kontos ist der Geldbetrag, der eingezahlt werden sollte.

</details>

--- 
  
**Aufgabe 7 - Bankinterne Überweisung.**

<details>

- Schreibe eine Funktion, die eine Überweisung simuliert. Diese Funktion besitzt 3 Parameter:
- Der 1. Parameter soll das Konto bestimmen, von dem aus überwiesen wird.
- Der 2. Parameter soll das Konto bestimmen, an das überwiesen wird.
- Der 3. Parameter bestimmt den zu überweisenden Betrag.
  Stelle vorher sicher, dass die beiden Konten existieren und genügend Geld beim Überweiser vorliegt. Berechne die neuen Kontostände der beiden Konten und speicher die neuen Kontostände in den entsprechenden Konten in der MutableMap ab.

</details>

 --- 
  
**Aufgabe 8 - Beta Test deiner App.**

<details>

- Nachdem du nun alle Funktionen erstellt hast, ist die Bank Software grundsätzlich startklar.
Bis jetzt wurde aber die Funktionalität noch nicht getestet.
- Formuliere deshalb innerhalb der main()-Funktion ein Testprogramm.
- Dieses Testprogramm sollte folgende Funktionalitäten deiner Bank austesten:

- Kontostand eines bestehenden Kontos ausgeben.
- Fehlermeldung, wenn versucht wird, den Kontostand eines nicht existierenden Kontos auszugeben.
- Ein neues Konto erstellen.
- Fehlermeldung, wenn versucht wird, ein neues Konto zu erstellen, obwohl der Name bereits vergeben ist.
- Ein bestehendes Konto löschen.
- Fehlermeldung, wenn versucht wird, ein nicht existierendes Konto zu löschen.
- Mindestens 10 Test-Transaktionen am Geldautomaten (ein- und auszahlen).
  Teste möglichst viele verschiedene Szenarien.
- Mindestens 3 Test-Überweisungen. Gebe nach jeder Überweisung die entsprechenden
  Kontostände der beteiligten Konten aus.

</details>
  

---

**Bonusaufgabe - Jahreszins auszahlen**

<details>

- Speichere zunächst in globalen Variablen den Zinssatz (z.B. 1%) und die Kontoführungskosten (0.99 €) unserer Bank ab.
- Schreibe nun eine Funktion, die für ein gegebenes Konto den Jahresabschluss berechnet. D.h. explizit, dass zuerst die Kontoführungskosten abgezogen werden, und danach der Kontostand um den Zinssatz der Bank erhöht wird.
- Prüfe wie bereits zuvor, ob das angegebene Konto überhaupt existiert. Sollte ein Kunde nicht genügend Geld haben, um die Kosten zu zahlen, wird sein Konto geschlossen. D.h. das Konto wird aus der MutableMap gelöscht und es wird eine Nachricht in der Konsole ausgegeben.

