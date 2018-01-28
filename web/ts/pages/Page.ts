/**
 * Defines a page and its initialization functions.
 *
 * @interface page
 */
interface Page {
    /**
     * Initializes the page. This function may phisically manipulate
     * the page and install event handlers.
     */
    init(): boolean;

    /**
     * Returns the name of the page
     */
    getName(): string;

    /**
     * Removes all elements added by this page.
     */
    destroy(): boolean;
}
