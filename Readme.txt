Jag har gjort b�da webbsidorna, se bifogad "Screenshot.png".

De kan visas med dessa url-er:
http://localhost:8080/addbox.html
http://localhost:8080/listboxes.html

Jag har inte anv�nt React och Spring Boot s� mycket tidigare s� den mesta tiden har g�tt till att l�sa in sig och f� grundfunktionaliteten att fungera.

D� jag b�rjar f� slut p� tid innan leverans f�rv�ntas s� har jag gjort f�ljande avgr�nsningar:
1. Ingen avancerad f�rgv�ljare har lagts till i formul�ret utan endast ett inmatningsf�lt.
2. Ingen databas anv�nds, jag provade installera MYSQL p� min dator men det var n�t problem s� den startade inte, har inte tid att utreda vad som �r problemet.
   Ist�llet s� sparar jag data i minnet p� servern, s� webbsidorna fungerar som om det fanns en riktig databas.
3. Begr�nsat antal unit-tester. Har inte testat webbdelarna.

Milj�:
Spring Boot konfigurerad med Web Module, Maven, Tomcat, Java 11.
Eclipse IDE for Java Developers 2021-06 (4.20.0) , JUnit 4.
Chrome v.95.0.4638.54
