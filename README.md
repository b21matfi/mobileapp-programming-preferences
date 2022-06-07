
# Rapport

Till denna uppgiften så började jag med att skapa en knapp för att kunna gå vidare till en annan acitivitymain, sedan skapade jag den andra acitivty
och kopplade ihop knappen med funktionen detta kan man se i figur 1. det koden gör i figur 1 är att när man klickar på knappen så går man vidare till den
activity man har valt. Efterdet skapade jag sharedprefrences i både second and main acitivty som man kan se i figur 2. Det denna koden gör är att den
skriver ut den den första om man har något där men om det inte finns något att hämta så skriver den ut unknown istället. Jag kopplade ihop både edit text och text så att 
den sparas på rätt ställe och sedan att den går vidare för att kunna visa på main sidan när man sparar på andra sidan. 

Detta kan man se på skrämdumparna som har tagits från appen. 

## Följande grundsyn gäller dugga-svar:

fel.

```
    public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
```
Figur 1.
```
sharedpref = getSharedPreferences("preferences", MODE_PRIVATE);
        String login = sharedpref.getString("username", "unknown");
```
Figur 2.
Bilder läggs i samma mapp som markdown-filen.

![](MainView.png)
![](SecondView.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
