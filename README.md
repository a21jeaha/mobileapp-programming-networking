
# Rapport 5: Networking

I `activity_main` skapades en __recyclerView__  

````
<androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recyclerView"                      // ges ett ID
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_constraintTop_toTopOf="parent"               // fyller ut längst med fönstret 
        app:layout_constraintBottom_toBottomOf="parent"         //
        app:layout_constraintStart_toStartOf="parent"           //
        app:layout_constraintEnd_toEndOf="parent"               //
        />
````

I JSON filen `mountain.json` börjar strängen med "[" vilket då betyder att det är en __array__, nästa tecken är ett "{" vilket visar starten på ett objekt, detta tolkas som att det måste finnas en array av objekt i filen, därför skapas först objektet i sig.
Objectet kommer att innehålla variabler relaterade till berg (enligt JSON-filen) därför döps classen till Mountain. Variabler skapas i klassen som översätts från JSON-filen. notera dock att i klassen skapas en instans av en annan klass, även denna måste skapas.

````
package com.example.networking;

public class Mountain {
    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;
    private Auxdata auxdata;       /// detta är ytterligare ett objekt som måste skapas

}
````
````
package com.example.networking;

public class Auxdata {
    private String wiki;
    private String img;
}
````
Slutligtviss så skapas den förstnämnda arrayen i `MainActivity`

````
  private ArrayList<Mountain> mountains;                /// arrayen deklareras och kommer innehålla data av typen Mountain (Klassen som precis skapades) 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mountains = new ArrayList<>();                  /// arrayen initieras som en medlems variabel 
        new JsonFile(this, this).execute(JSON_FILE);
    }
````

En ny android resursfil skapades där en basic layout med image- och textView implemeterades, denna kommer att användas som en "rad" i recyclerviewn. 







**Skriv din rapport här!**

_Du kan ta bort all text som finns sedan tidigare_.

## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.

```
function errorCallback(error) {
    switch(error.code) {
        case error.PERMISSION_DENIED:
            // Geolocation API stöds inte, gör något
            break;
        case error.POSITION_UNAVAILABLE:
            // Misslyckat positionsanrop, gör något
            break;
        case error.UNKNOWN_ERROR:
            // Okänt fel, gör något
            break;
    }
}
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
