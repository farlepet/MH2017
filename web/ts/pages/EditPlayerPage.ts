/// <reference path="Page.ts"/>

/**
 * Defines the player editor page
 *
 * @class EditPlayerPage
 */
class EditPlayerPage implements Page {
    /**
     * Initializes the page. This function may phisically manipulate
     * the page and install event handlers.
     */
    init(): boolean {


        return true;
    }

    /**
     * Returns the name of the page
     */
    getName(): string {
        return "Edit Player";
    }

    /**
     * Removes all elements added by this page.
     */
    destroy(): boolean {
        return true;
    }
}
