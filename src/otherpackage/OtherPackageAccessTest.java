package otherpackage;

import test.*;

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

    }
}
