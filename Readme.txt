Jag har gjort båda webbsidorna, se bifogad "Screenshot.png".

De kan visas med dessa url-er:
http://localhost:8080/addbox.html
http://localhost:8080/listboxes.html

Jag har inte använt React och Spring Boot så mycket tidigare så den mesta tiden har gått till att läsa in sig och få grundfunktionaliteten att fungera.

Då jag börjar få slut på tid innan leverans förväntas så har jag gjort följande avgränsningar:
1. Ingen avancerad färgväljare har lagts till i formuläret utan endast ett inmatningsfält.
2. Ingen databas används, jag provade installera MYSQL på min dator men det var nåt problem så den startade inte, har inte tid att utreda vad som är problemet.
   Istället så sparar jag data i minnet på servern, så webbsidorna fungerar som om det fanns en riktig databas.
3. Begränsat antal unit-tester. Har inte testat webbdelarna.

Miljö:
Spring Boot konfigurerad med Web Module, Maven, Tomcat, Java 11.
Eclipse IDE for Java Developers 2021-06 (4.20.0) , JUnit 4.
Chrome v.95.0.4638.54
