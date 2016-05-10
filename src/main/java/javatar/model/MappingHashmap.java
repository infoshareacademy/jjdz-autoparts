package javatar.model;

import java.util.HashMap;

public class MappingHashmap {

    //String name from Json file, Integer allegro catId

    public static HashMap<String, Integer> JsonXmlMapping = new HashMap<String, Integer>() {{
        put("Układ hamulcowy",19105);
        put("Układ zapłonowy/układ wspomagania rozruchu zimnego silnika",620);
        put("Elektryka",19029);
        put("Serwis / inspekcja / przegląd - czężci",620);
        put("System tworzenia mieszanki paliwowej",19053);
        put("Dwużlad",620);
        put("Nadwozie",8683);
        put("Silnik",19089);
        put("Układ wydechowy",19085);
        put("Filtr",49236);
        put("Układ chłodzenia",18689);
        put("Zawieszenie / tłumienie",8683);
        put("Układ kierowniczy",252243);
        put("Zawieszenie osi / prowadzenie kół / koła",8683);
        put("Napęd koła",50863);
        put("Zestaw zaczepu przyczepy / pojedyncze czesci",620);
        put("Paski napędowe",50864);
        put("Czyszczenie szyb",254179);
        put("Serwis / inspekcja / przegląd - czężci",620);
        put("Sprzęgło / czężci montażowe",50821);
        put("Układ zasilania paliwem",18844);
        put("Ogrzewanie / wentylacja",49183);
        put("Klimatyzacja",49183);
        put("System tworzenia mieszanki paliwowej",18844);
        put("Systemy komfortowe",620);
        put("Wyposażenie wnętrza",622);
        put("Urządzenie transportowe",620);
        put("Dodatki",629);
        put("Koła / opony",18730);
        put("Skrzynia biegów",50871);
        put("Napęd osi",50863);
        put("Systemy informacji / komunikacji",620);
        put("Układ czyszczenia reflektorów",620);
        put("System zamykania",18892);
    }};

    public static int getAllegroCategoryId (String name){

        return JsonXmlMapping.get(name);
    }



}
