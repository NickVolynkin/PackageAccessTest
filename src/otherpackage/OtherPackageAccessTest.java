package otherpackage;

import test.ChildPublic;

/**
 * @author Nick Volynkin  nick.volynkin@gmail.com
 */
public class OtherPackageAccessTest {

    {
        //Legal!
        new ChildPublic().foo();

        //illegal
        /*
        new ParentPackage().foo();
        new ChildProtected().foo();
        new ChildPrivate().foo();
        */

        //legal
        new OtherPackageChildProtected().foo();
        new OtherPackageChildPublic().foo();

        //illegal
        /* new OtherPackageChildPrivate().foo(); */

    }
}
