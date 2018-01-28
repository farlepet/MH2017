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

        teams : TeamJSON[];
    
        /**
         * Initializes the page. This function may phisically manipulate
         * the page and install event handlers.
         */
        init(): boolean {
            this.container = $("#main-container");

            this.teamSelect = $("<select/>").on("change", () => this.onTeamSelect());

            this.container.append(this.teamSelect).append(
                $("<button id='sel-team'/>").text("Pick Team")
            );

            this.container.append(
                $("<form/>", {
                    action: ".",
                    method: "get"
                }).append(
                    $("<label for='name'/>").text("Team Name: ")
                ).append("<input type='text' name='name' id='team-name'/>")
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

            ajaxGet.teams((teams) => this.displayTeams(teams));
    
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

        displayTeams(teams : TeamJSON[]) {
            this.teams = teams;
            
            this.teamSelect.empty();

            console.log(teams);

            for(let i in teams) {
                this.teamSelect.append(
                    $("<option/>", {
                        value: i
                    }).text(teams[i].name)
                );

                console.log(teams[i]);
            }
        }

        onTeamSelect() {
            var idx = +this.teamSelect.val();

            $("#team-name").val(this.teams[idx].name);
        }
    }
    