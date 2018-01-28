/// <reference path="Page.ts"/>

/**
 * Defines the player editor page
 *
 * @class FormationPage
 */
class FormationPage implements Page {
    
        container : JQuery;

        leftContainer  : JQuery;
        rightContainer : JQuery;

        formationList : JQuery;
    
        /**
         * Initializes the page. This function may phisically manipulate
         * the page and install event handlers.
         */
        init(): boolean {
            this.container = $("#main-container");

            this.leftContainer  = $("<div/>", { class: "leftContainer" });
            this.rightContainer = $("<div/>", { class: "rightContainer" });

            this.container.append(this.leftContainer).append(this.rightContainer);

            this.formationList = $("<select/>", {
                size: 6
            });

            this.leftContainer.append(this.formationList);

            this.leftContainer.append($("<br/>"));

            this.leftContainer.append(
                $("<button/>").text("Update Formation")
            ).append(
                $("<button/>").text("Add Formation")
            );
    
            return true;
        }
    
        /**
         * Returns the name of the page
         */
        getName(): string {
            return "Edit Formations";
        }
    
        /**
         * Removes all elements added by this page.
         */
        destroy(): boolean {
            this.container.empty();
    
            return true;
        }
    }
    