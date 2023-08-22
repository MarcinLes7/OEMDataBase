# OEMDataBase
Marcin Leśniak, Studia podyplomowe Java Web Development 2022/2023,

Nazwa projektu: Occupational Exposure Measurements Database - Baza wyników pomiarów czynników szkodliwych na stanowiskach pracy.
Celem projektu jest usprawnienie procesu zarządzania wynikami pomiarów czynników szkodliwych na stanowiskach pracy w zakładzie pracy. 

Aplikacja będzie miała za zadanie umożliwienie wprowadzania przez użytkownika wyników pomiarów czynników szkodliwych na stanowiskach pracy a następnie umożliwienie wyświetlania tych wyników w postaci tabel lub wykresów.

Aplikacja będzie składała się z następujących stron:
- strony startowej,
- strony do wprowadzania wyników pomiarów,
- strony do wyświetlania wyników pomiarów,

Strona startowa zawierać będzie ogólny opis idei powstania strony i jej funkcjonalności. Strona zawierac będzie ponadto definicje czynników szkodliwych (chemiczne, fizyczne, biologiczne), zasady wykonywania pomiarów tych czynników na stanowiskach pracy oraz zasady interpretacji wyników pomiarów,

Strona do wprowadzania wyników posiadac będzie możliwość wybrania nazwy stanowiska pracy, rodzaju czynika szkodliwego, daty pomiaru, wyniku pomiaru oraz jego interpretacji, a także imię i nazwisko osoby wykonującej prace na stanowisku,

Strona do wyświetlania wyników pomiarów posiadać będzie możliwość wyświetlania wyników w postaci tabelarycznej oraz w postaci wykresów, w tym w podziale na stanowiska pracy i czynniki szkodliwe.

## Strona startowa Baza OEM
Strona startowa zawiera poziomy pasek nawigacji w nagłówkowej cześci strony. Poniżej znajduje się fotografia ze znakami ostrzegawczyni dla czynników szkodliwych w środowisku pracy. Pod fotografią zostało przywołane rozporządzenie Ministra Zdrowia na podstawie którego wykonywane sa pomiary czynników szkodliwych na stanowiskach pracy. Poniżej tekstu znajduje się przycisk "Wprowadzanie wyników pomiarów". Przysisk służy do otworzenia strony z formularzem w którym wymagane jest wprowadzenie wyników pomiarów oraz szczegółów dotyczących stanowiska pracy.

Poziomy pasek nawigacji w częsci nagłówkowej strony startowej składa się z następujących odnośników:
- klikalnego logo "Baza OEM" za którego pomocą istnieje możliwość powrotu na stronę startową z innych stron aplikacji,
- odnośnika "Opis czynników szkodliwych" za pomocą którego istnieje możliwośc przejścia na stronę opisująca najczęściej występujące w środowisku pracy czynniki szkodliwe, ich charakterystyką oraz wartości najwyższych dopuszczalnych stężeń i natężeń w środowisku pracy,
- odnośnika "Baza czynników" prowadzącego do strony z wybieralną listą czynników szkodliwych zawierająca także wartości najwyższych dopuszczalnych stężen i natężeń tych czynników,
- odnośnika "wyświetl wyniki pomiarów" prowadzącego do strony z podsumowaniem wykonanych i zapisanych w bazie wyników pomiarów na stanowiskach pracy,

## Opis czynników szkodliwych
Strona otwierająca się po kliknięciu na odnośnik "opis czynników szkodliwych"  opisuje najczęściej występujące w środowisku pracy czynniki szkodliwe. Skupia się na wyjaśnieniu definicji czynnika szkodliwego otakiego jak np hałas lub czynniki chemiczne, następnie opisuje sposób działania szkodliwego czynnika na organizm człowieka oraz przywołuje wartości najwyższych dopuszczalnych stężeń i natężeń dla tych czynników. Na stronie znajduje sie także wyjaśnienie definicji najwyższego dopuszczalnego stężenia oraz Najwyższego dopuszczalnego natężenia. Dodatkowo na stronei znajduje się wyjasnienie pojęcia OEL, które jest równoznaczne z pojęciem NDS / NDN stosowanym w krajach zachodnich.

