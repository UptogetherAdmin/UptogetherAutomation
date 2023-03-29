Process to run all the

Process to use Explicit wait:

1. For Home page loader
    1. Extend your class with GenericWrapper class
    2. Then call the explicit wait of your choice.
    3  For now use this for home page loader
         fnWaitInvisibility(driver,"xpath==//div[@class='pageLoader']");
    4. The above is the function written which takes in xpath locator and driver object
    5. This will wait until the element located by the one in xpath will disappear of fail if not

Will be adding other ones as well in the Generic Wrapper class
