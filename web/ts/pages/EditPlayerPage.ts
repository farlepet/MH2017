/// <reference path="Page.ts"/>

/**
 * Defines the player editor page
 *
 * @class EditPlayerPage
 */
class EditPlayerPage implements Page {

    container : JQuery;

    injuries : JQuery;



    /**
     * Initializes the page. This function may phisically manipulate
     * the page and install event handlers.
     */
    init(): boolean {
        this.container = $("#main-container");

        this.container.append(
            $("<form/>", {
                action: ".",
                method: "get"
            }).append(
                $("<label for='name'/>").text("Player name: ")
            ).append(
                $("<input type='text' name='name'/>")
            ).append($("<br/>")).append(
                $("<label for='number'/>").text("Number: ")
            ).append(
                $("<input type='number' name='number'/>", {
                    min: 0
                })
            ).append($("<br/>")).append(
                $("<label for='age'/>").text("Age: ")
            ).append(
                $("<input type='number' name='age'/>", {
                    max: 150,
                    min: 0
                })
            ).append($("<br/>")).append(
                $("<label for='height'/>").text("Height: ")
            ).append(
                $("<input type='number' name='height'/>", {
                    min: 0,
                    max: 150
                })
            ).append(
                $("<label for='height'/>").text(" in.")
            ).append($("<br/>")).append(
                $("<label for='weight'/>").text("Weight: ")
            ).append(
                $("<input type='number' name='weight'/>", {
                    min: 0,
                    max: 500
            })).append(
                $("<label for='weight'/>").text(" lb.")
            ).append($("<br/>")).append(
                $("<button name='submit' value='update'/>").text("Update")
            )
        );

        this.container.append($("<br/><br/>")).append(
            $("<h3/>").text("Injury History:")
        ).append(
            $("<br/>")
        );

        this.injuries = $("<select>", {
            size: 5
        });

        this.container.append(this.injuries);

        // TODO: Grab injuries from the server


        this.container.append(
            $("<form/>", {
                action: ".",
                method: 'GET'
            }).append(
                $("<label for='type'/>").text("Type of injury: ")
            ).append(
                $("<select name='type'/>")
            ).append($("<br/>")).append(
                $("<label for='date'/>").text("Date of injury: ")
            ).append(
                $("<input type='date' name='date'/>")
            ).append($("<br/>")).append(
                $("<button name='submit' value='add'/>").text("Add Injury")
            ).append(
                $("<button name='submit' value='update'/>").text("Update Injury")
            )
        );

        return true;
    }

    /**
     * Returns the name of the page
     */
    getName(): string {
        return "Edit Player Information";
    }

    /**
     * Removes all elements added by this page.
     */
    destroy(): boolean {
        this.container.empty();

        return true;
    }
}
