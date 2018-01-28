/// <reference path="Page.ts"/>

/**
 * Defines the player editor page
 *
 * @class EditTeamPage
 */
class EditTeamPage implements Page {
    
        container : JQuery;

    
        /**
         * Initializes the page. This function may phisically manipulate
         * the page and install event handlers.
         */
        init(): boolean {
            this.container = $("#main-container");

            
    
            return true;
        }
    
        /**
         * Returns the name of the page
         */
        getName(): string {
            return "Main Page";
        }
    
        /**
         * Removes all elements added by this page.
         */
        destroy(): boolean {
            this.container.empty();
    
            return true;
        }
    }
    