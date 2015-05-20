package otherpackage;

import test.Parent;

/**
 * @author Nick Volynkin  nick.volynkin@gmail.com
 */
public class OtherPackageChildPrivate extends Parent {

    // This is not an override
    /* @Override */
    private void foo() {
    }

}
