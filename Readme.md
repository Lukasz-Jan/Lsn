

Rozwiązania dostarczone w pakietach
wg kolejności zadań odpowiednio:

* task.one - pierwsze zadanie
* task.two - drugie zadanie
* task.three - trzecie zadanie

Dane wejściowe są generowane w testach.

### Uruchomienie programów. 
Testy do każdego zadania odpowiednio w pakietach wg nazewnictwa pakietów.
Wchodzimy w klasę testową i uruchamiamy test @Test (ctrl-shift-f10).


Możliwość także uruchomienia programów przez
komendy maven uruchamiające testy z klas testowych
np:

 - mvn test -Dtest=TaskOneTest
 - mvn test -Dtest=TaskOneTest#generalOutputTest
 - mvn test -Dtest=TaskTwoTest
 - mvn test -Dtest=TaskThreeTest#sortInput
 - mvn test -Dtest=TaskThreeTest
 - mvn test -Dtest=TaskThreeTest#fechRoots_3



