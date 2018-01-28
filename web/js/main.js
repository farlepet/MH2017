"use strict";
var EditPlayerPage = (function () {
    function EditPlayerPage() {
    }
    EditPlayerPage.prototype.init = function () {
        this.container = $("#main-container");
        this.container.append($("<form/>", {
            action: ".",
            method: "get"
        }).append($("<label for='name'/>").text("Player name: ")).append($("<input type='text' name='name'/>")).append($("<br/>")).append($("<label for='number'/>").text("Number: ")).append($("<input type='number' name='number'/>", {
            min: 0
        })).append($("<br/>")).append($("<label for='age'/>").text("Age: ")).append($("<input type='number' name='age'/>", {
            max: 150,
            min: 0
        })).append($("<br/>")).append($("<label for='height'/>").text("Height: ")).append($("<input type='number' name='height'/>", {
            min: 0,
            max: 150
        })).append($("<label for='height'/>").text(" in.")).append($("<br/>")).append($("<label for='weight'/>").text("Weight: ")).append($("<input type='number' name='weight'/>", {
            min: 0,
            max: 500
        })).append($("<label for='weight'/>").text(" lb.")));
        this.container.append($("<br/><br/>")).append($("<h3/>").text("Injury History:")).append($("<br/>"));
        this.injuries = $("<select>", {
            size: 5
        });
        this.container.append(this.injuries);
        this.container.append($("<form/>", {
            action: ".",
            method: 'GET'
        }).append($("<label for='type'/>").text("Type of injury: ")).append($("<select name='type'/>")).append($("<br/>")).append($("<label for='date'/>").text("Date of injury: ")).append($("<input type='date' name='date'/>")));
        return true;
    };
    EditPlayerPage.prototype.getName = function () {
        return "Edit Player Information";
    };
    EditPlayerPage.prototype.destroy = function () {
        this.container.empty();
        return true;
    };
    return EditPlayerPage;
}());
var currentPage;
$(document).ready(function docReady() {
    currentPage = new EditPlayerPage();
    document.title = "Safety Playbook - " + currentPage.getName() + " | MinneHack 2018";
    currentPage.init();
});
//# sourceMappingURL=main.js.map