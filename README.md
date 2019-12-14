## Builder

1. Convert User into a class that can only be build by UserBuilder. (UserBuilderTest might help you)
+ Make it illegal to build a user with age under < 18 by throwing illegalStateException in build() method.
+ Create a class "SeniorCitizen", refactor the builder, so that it creates a SeniorCitizen instead of a normal User, if age is over or equal >= 65
+ Write unit tests to prove it works

## Decorator

2. BasicPasswordValidator is a class that tests if a password matches all criterias (has a digit, capital letter, special character etc.). It doesn't have any criteria other than "not empty". However, it can be decorated in runtime by RequiredCapitalLetterValidator. Write the rest of the decorators and make the password validator bulletproof.
+ Convert the Coffee from examples into a Decorator
+ Create a LowerCaseInputStream, that can decorate BufferedInputStream (which is a decorator itself, BTW), so that it could load a file (through FileInputStream) and convert the content to lower case as the content is being read (with `.read()` method). 

## Singleton

3. Create a singleton Logger class with following methods:
- `.error(String message)`
- `.warn(String message)`
- `.info(String message)`
each method is supposed to print the message with a prefix "error"/"warn"/"info"
+ create a method `.setLogToFile(String filename)` which will cause the logger append the messages to a file
+ create a method `.setFormat(String format)`. Format can have three tokens: `#d` (current date), `#m` (message), `#L` (log level, i.e. error, warn), sample format "{{#L}}(#d) --> #m" should result in messages like "{{error}} 27.10.2018 --> User must accept GDPR before making an order"

## Factory

4. Consider WebConnector an abstract way of connecting to online services and a factory at the same time. Implement HttpConnector and WebsocketConnector, so that they are concrete implementation of WebConnector. Factory method should decide which implementation to `.create()` based on url - depending if it contains `http:\\` or `websocket:\\`
+ Prove your solution works by unit tests (WebConnectorTest)

## Observable

Na podstawie kodu na tym branchu (pliki w pakiecie `designpatterns.examples.observer`) poprosiłbym was o podobny program, który symulowałby ładowanie pliku. Można stworzyć nowy Timer (obserwowany), który notyfikowałby obserwujących o postępie łądowania (na potrzeby zabawy - co postęp mógłby następować co 100milisekund). Obserwującymi byłyby obiekty ProgressMeter (Wyświetlający na konsoli % ładowania pliku) oraz Notification który wyświetlałby informację "ładowanie zakończone" (gdy progres będzie stuprocentowy).

Zadanie na szóstkę, idealnie trzeba sprawić, by po załadowaniu pliku (100%) zatrzymać ładowanie (tego nie było na zajęciach, można przyjąć różne założenia,  i różnie to zrobić, ciekaw jestem waszych pomysłów).