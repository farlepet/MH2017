/// <reference path="pages/EditPlayerPage.ts"/>
/// <reference path="pages/EditTeamPage.ts"/>
/// <reference path="pages/FormationPage.ts"/>

/// <reference path="ajax/ajaxGet.ts"/>
/// <reference path="ajax/ajaxPut.ts"/>

var currentPage : Page;

var pageList : Page[] = [
    new EditTeamPage(),
    new EditPlayerPage(),
    new FormationPage()
];

$(document).ready(function docReady() {
    currentPage = pageList[0];

    document.title = "Safety Playbook - " + currentPage.getName() + " | MinneHack 2018";

    currentPage.init();

    for(let i in pageList) {
        $("#page-select").append(
            $("<option/>", {
                value: i.toString()
            }).text(pageList[i].getName())
        );
    }

    $("#goto-page").on("click", () => {
        currentPage.destroy();
        currentPage = pageList[+$("#page-select").val()];
        currentPage.init();
        document.title = "Safety Playbook - " + currentPage.getName() + " | MinneHack 2018";
    });
});