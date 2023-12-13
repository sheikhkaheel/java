import Students.FirstStudent;

//Package is a mechanism of encapsulation  group of similiar classes , interfaces or subpackages on basis of their functionality

public class Package {
    public static void main(String[] args) {
        FirstStudent fs = new FirstStudent();
        fs.marks();
    }
}


// Predefined Pacakages

// These packages consist of a large number of classes which are a part of Java API.Some of the commonly used built-in packages are:
// 1) java.lang: Contains language support classes(e.g classed which defines primitive data types, math operations). This package is automatically imported.
// 2)  java.io: Contains classed for supporting input / output operations.
// 3)  java.util: Contains utility classes which implement data structures like Linked List, Dictionary and support ; for Date / Time operations.
// 4)  java.applet: Contains classes for creating Applets.For generating dynamic content
// 5)  java.awt: Contain classes for implementing the components for graphical user interfaces (like button , ;menus etc).
// 6)  java.net: Contain classes for supporting networking operations.