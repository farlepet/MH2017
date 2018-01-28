/// <reference path="Page.ts"/>

/**
 * Defines the player editor page
 *
 * @class EditTeamPage
 */
class EditTeamPage implements Page {
    
        container : JQuery;

        teamSelect   : JQuery;
        playerSelect : JQuery;
    
        /**
         * Initializes the page. This function may phisically manipulate
         * the page and install event handlers.
         */
        init(): boolean {
            this.container = $("#main-container");

            this.teamSelect = $("<select/>");

            this.container.append(this.teamSelect).append(
                $("<button id='sel-team'/>").text("Pick Team")
            );

            this.container.append(
                $("<form/>", {
                    action: ".",
                    method: "get"
                }).append(
                    $("<label for='name'/>").text("Team Name: ")
                ).append("<input type='text' name='name'/>")
            ).append($("<br/>")).append(
                $("<h3/>").text("Players:")
            );

            this.playerSelect = $("<select/>", {
                size: 10
            });

            this.container.append(this.playerSelect);

            this.container.append($("<br/>")).append(
                $("<button id='mod-player'/>").text("Modify Player")
            );
    
            return true;
        }
    
        /**
         * Returns the name of the page
         */
        getName(): string {
            return "Edit Team Information";
        }
    
        /**
         * Removes all elements added by this page.
         */
        destroy(): boolean {
            this.container.empty();
    
            return true;
        }
    }
    