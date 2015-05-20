package test;

import otherpackage.OtherPackageChildPublic;

/**
 * @author Nick Volynkin  nick.volynkin@gmail.com
 */
public class SamePackageAccessTest {

    {
        new Parent().foo();

        //these have overriden foo()
        new ChildPublic().foo();
        new ChildProtected().foo();

        //this one had not overriden foo()
        new ChildPrivate().foo();

        //Legal
        new OtherPackageChildPublic().foo();

        //illegal
        /* new OtherPackageChildPrivate().foo(); */
        /* new OtherPackageChildProtected().foo(); */

    }

}
