// advanced OOPs concepts
// 1. copy constructor
// 2. Passing objects as arguments
// 3. returning object from a method

package OOPs;

class Language {
    String name;
    boolean isObjectOriented;
    int popularity;

    // regular constructor
    Language (String name, boolean isObjectOriented, int popularity) {
        this.name = name;
        this.isObjectOriented = isObjectOriented;
        this.popularity = popularity;
    }

    // copy constructor , call by reference
    Language(Language lang) {
        this.name = lang.name;
        this.isObjectOriented = lang.isObjectOriented;
        this.popularity = lang.popularity;
    }


    // taking object as argument and returning object
    Language add_stars(Language l1) {
        this.name += "***";
        this.isObjectOriented = true;
        this.popularity = 8;

        return l1;
    }


}

public class passing_object_as_parameters {
    public static void main(String[] args) {

        // object creation
        Language java = new Language("Java", true, 7);
        // using copy constructor to copy attribute values of previous object
        Language c_plus_plus = new Language(java);

        // printing copy constructor values
        System.out.println("Language name is " + c_plus_plus.name);
        System.out.println("Is Object oriented is " + c_plus_plus.isObjectOriented);
        System.out.println("Popularity is " + c_plus_plus.popularity);

        // passing object as a parameter in .add_stars() method
        Language java_with_stars = new Language(java);
        // storing the returned value in object
        java_with_stars = java_with_stars.add_stars(java_with_stars);
        System.out.println("**************************");
        System.out.println("Name is " + java_with_stars.name);
        System.out.println("Is object oriented" + java_with_stars.isObjectOriented);
        System.out.println("Popularity is " + java_with_stars.popularity);

    }
}
