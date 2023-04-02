# PC2T
Představte si, že vytváříte program pro správu seznamu filmů. Každý film má název, režiséra, rok
vydání, seznam herců a hodnocení diváků (skládá se z bodového hodnocení a případně slovního
komentáře). Existují dva druhy filmů:
-a) Hrané filmy – tyto filmy mají seznam herců a bodové hodnocení diváků se vyjadřuje pomocí
počtu hvězdiček od 1 do 5.
-b) Animované filmy – tyto filmy mají místo seznamu herců několik animátorů a bodové
hodnocení diváků se vyjadřuje pomocí kladného čísla od 1 do 10. Navíc obsahují
doporučený věk diváka.
Vytvořte v programovacím jazyce Java ve vývojovém prostředí Eclipse program, který umožní uživateli
následující funkce:
-a) Přidání nového filmu – uživatel vybere druh filmu, zadá název, režiséra, rok vydání a případně
seznam herců nebo animátorů. Pokud jde o animovaný film, uživatel zadá kromě názvu, režiséra a roku
vydání také doporučený věk diváka.
-b) Upravení filmu – uživatel vybere film podle názvu a může provést úpravu názvu, režiséra, roku
vydání, seznamu herců nebo animátorů a v případě animovaných filmů i doporučený věk diváků.
-c) Smazání filmu – uživatel vybere film podle názvu a smaže ho ze seznamu.
-d) Přidání hodnocení danému filmu – bodové hodnocení dle druhu filmu, slovní hodnocení volitelně
-e) Výpis filmů – uživatel může nechat vypsat všechny filmy, přičemž se zobrazí název, režisér, rok vydání
a seznam herců nebo animátorů a v případě animovaného filmu doporučený věk diváků.
-f) Vyhledání filmu – uživatel zadá název filmu a zobrazí se mu informace o něm (název, režisér, rok
vydání, seznam herců nebo animátorů a hodnocení diváků). Přičemž hodnocení diváků bude seřazeno
sestupně dle bodového hodnocení.
-g) Výpis herců nebo animátorů, kteří se podíleli na více než jednom filmu – uživatel dostane seznam
herců nebo animátorů, kteří se podíleli na více než jednom filmu a u každého z nich se zobrazí seznam
filmů, na kterých se podíleli.
-h) Výpis všech filmů, které obsahují konkrétního herce nebo animátora – uživatel zadá jméno herce
nebo animátora a zobrazí se mu seznam filmů, ve kterých hrál nebo na kterých se podílel.
-i) Uložení informace o vybraném filmu (dle jeho názvu) do souboru.
-j) Načtení všech informací o daném filmu ze souboru (soubor obsahuje vždy jeden film)
-k) Při ukončení programu se uloží veškeré informace do SQL databáze.
-l) Při spuštění programu se veškeré informace načtou z SQL databáze.
Pozn. SQL databáze bude využívána pouze při spuštění a ukončení programu.
Program musí dále obsahovat následující:
- Efektivní využití základních vlastností OOP.
- Alespoň jednu abstraktní třídu nebo rozhraní
- Alespoň jednu dynamickou datovou strukturu 
