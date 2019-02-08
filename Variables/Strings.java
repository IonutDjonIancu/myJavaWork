package org.gameloft.Variables;

public class Strings
{
    public static void main(String[] args)
    {
        // Strings are non-primitive data types
        // Strings are objects

        // String declaration:
        String firstName;
        String lastName;

        // String initialization
        firstName = null;
        lastName = "";

        String u = "Star Wars is an American epic space opera franchise, created by George Lucas and centered around a film series that began with the eponymous 1977 movie. The saga quickly became a worldwide pop culture phenomenon.\n" +
                "\n" +
                "The first film, subtitled Episode IV: A New Hope with its 1981 re-release, was followed by two successful sequels, Episode V: The Empire Strikes Back (1980) and Episode VI: Return of the Jedi (1983); forming the original Star Wars trilogy. A subsequent prequel trilogy, consisting of Episode I: The Phantom Menace (1999), Episode II: Attack of the Clones (2002) and Episode III: Revenge of the Sith (2005), was met with mixed reactions from critics and fans. Finally, a concluding sequel trilogy of the nine-episode saga began with Episode VII: The Force Awakens (2015), continued with Episode VIII: The Last Jedi (2017) and is aimed to end with the final 2019 movie.[1] The first eight films were nominated for Academy Awards (with wins going to the first two released) and were commercially successful, with a combined box office revenue of over US$8.5 billion.[2] Together with the theatrical spin-off films The Clone Wars (2008), Rogue One (2016), and Solo (2018), Star Wars is the second-highest-grossing film series of all time.[3]\n" +
                "\n" +
                "The film series has spawned into other media, including books, television shows, computer and video games, theme park attractions and lands, and comic books, resulting in significant development of the series' fictional universe. Star Wars holds a Guinness World Records title for the \"Most successful film merchandising franchise\". In 2018, the total value of the Star Wars franchise was estimated at US$65 billion, and it is currently the fifth-highest-grossing media franchise.";

        // String re-initialization
        firstName = "Joe";
        lastName = "Dane";

        // String declaration + initialization
        String x = "something";
        x = "something else unnamed";

        // String concatenation, aka gluing some strings together
        char y[] = x.toCharArray();
        System.out.println(y);
        System.out.println(y[3]);
        System.out.println("-------------");
        System.out.println(firstName + " " + lastName);

        // String to array
        System.out.println(x);
        y[0] = 'B';
        System.out.println(y);

        // lower case, upper case
        x = x.toUpperCase();
        System.out.println(x);
        System.out.println(x.toLowerCase());
        System.out.println(x.length());

        // ends with, starts with
        System.out.println(x.startsWith("SOME"));
        System.out.println(x.startsWith("some"));
        System.out.println("---------");

        // String operations
        System.out.println("abc" + "xyz");
        System.out.println("abc" + 3.4);

        System.out.println("n".concat("m"));
        System.out.println(firstName.concat(lastName).concat(firstName));

        // String formatting
        System.out.println(String.format("%s %s", firstName, lastName));    // strings
        System.out.println(String.format("%d %d %d", 1, 2, 1+2));           // integers
        System.out.println(String.format("%f %f", 1.4, 2.5));               // floats
        System.out.println(String.format("%.2f %.3f", 1.4, 2.5));           // shortened floats
        System.out.println(String.format("%.2f", 1.4 / 2.5));               // shortened floats
        System.out.println(String.format("%s %s %s", 1.4, 2, "hello"));     // shortened floats
        System.out.println(String.format("%b", 1 > 2));                     // shortened floats
        System.out.println(String.format("%h", 14));                        // hex values
        System.out.println(String.format("%h", 'A'));                       // hex values























    }
}
