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
        })).append($("<label for='weight'/>").text(" lb.")).append($("<br/>")).append($("<button name='submit' value='update'/>").text("Update")));
        this.container.append($("<br/><br/>")).append($("<h3/>").text("Injury History:")).append($("<br/>"));
        this.injuries = $("<select>", {
            size: 5
        });
        this.container.append(this.injuries);
        this.container.append($("<form/>", {
            action: ".",
            method: 'GET'
        }).append($("<label for='type'/>").text("Type of injury: ")).append($("<select name='type'/>")).append($("<br/>")).append($("<label for='date'/>").text("Date of injury: ")).append($("<input type='date' name='date'/>")).append($("<br/>")).append($("<button name='submit' value='add'/>").text("Add Injury")).append($("<button name='submit' value='update'/>").text("Update Injury")));
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
var EditTeamPage = (function () {
    function EditTeamPage() {
    }
    EditTeamPage.prototype.init = function () {
        this.container = $("#main-container");
        this.teamSelect = $("<select/>");
        this.container.append(this.teamSelect).append($("<button id='sel-team'/>").text("Pick Team"));
        this.container.append($("<form/>", {
            action: ".",
            method: "get"
        }).append($("<label for='name'/>").text("Team Name: ")).append("<input type='text' name='name'/>")).append($("<br/>")).append($("<h3/>").text("Players:"));
        this.playerSelect = $("<select/>", {
            size: 10
        });
        this.container.append(this.playerSelect);
        this.container.append($("<br/>")).append($("<button id='mod-player'/>").text("Modify Player"));
        return true;
    };
    EditTeamPage.prototype.getName = function () {
        return "Edit Team Information";
    };
    EditTeamPage.prototype.destroy = function () {
        this.container.empty();
        return true;
    };
    return EditTeamPage;
}());
var FormationPage = (function () {
    function FormationPage() {
    }
    FormationPage.prototype.init = function () {
        this.container = $("#main-container");
        this.leftContainer = $("<div/>", { class: "leftContainer" });
        this.rightContainer = $("<div/>", { class: "rightContainer" });
        this.container.append(this.leftContainer).append(this.rightContainer);
        this.formationList = $("<select/>", {
            size: 6
        });
        this.leftContainer.append(this.formationList);
        this.leftContainer.append($("<br/>"));
        this.leftContainer.append($("<button/>").text("Update Formation")).append($("<button/>").text("Add Formation"));
        return true;
    };
    FormationPage.prototype.getName = function () {
        return "Edit Formations";
    };
    FormationPage.prototype.destroy = function () {
        this.container.empty();
        return true;
    };
    return FormationPage;
}());
var ajaxGet;
(function (ajaxGet) {
    function teams(callback) {
        $.ajax({
            method: "GET",
            url: "35.196.202.58:4040",
            data: { r: "getTeams" },
            dataType: "json",
            success: function (data) {
                if ("error" in data) {
                    console.log(data);
                    alert("Error fetching teams: " + data.error);
                }
                else {
                    console.info("Teams fetched: " + data.teams);
                    callback(data.teams);
                }
            },
            cache: false
        });
    }
    ajaxGet.teams = teams;
})(ajaxGet || (ajaxGet = {}));
var ajaxPut;
(function (ajaxPut) {
    function team(name) {
        $.ajax({
            method: "GET",
            url: "35.196.202.58:4040",
            data: { r: "addTeam", n: name },
            dataType: "json",
            success: function (data) {
                if ("error" in data) {
                    console.log(data);
                    alert("Error adding team: " + data.error);
                }
                else {
                    console.info("Team added: " + data);
                }
            },
            cache: false
        });
    }
    ajaxPut.team = team;
})(ajaxPut || (ajaxPut = {}));
var currentPage;
var pageList = [
    new EditTeamPage(),
    new EditPlayerPage(),
    new FormationPage()
];
$(document).ready(function docReady() {
    currentPage = pageList[0];
    document.title = "Safety Playbook - " + currentPage.getName() + " | MinneHack 2018";
    currentPage.init();
    for (var i in pageList) {
        $("#page-select").append($("<option/>", {
            value: i.toString()
        }).text(pageList[i].getName()));
    }
    $("#goto-page").on("click", function () {
        currentPage.destroy();
        currentPage = pageList[+$("#page-select").val()];
        currentPage.init();
        document.title = "Safety Playbook - " + currentPage.getName() + " | MinneHack 2018";
    });
});
var MainPage = (function () {
    function MainPage() {
    }
    MainPage.prototype.init = function () {
        this.container = $("#main-container");
        return true;
    };
    MainPage.prototype.getName = function () {
        return "Main Page";
    };
    MainPage.prototype.destroy = function () {
        this.container.empty();
        return true;
    };
    return MainPage;
}());
//# sourceMappingURL=main.js.map