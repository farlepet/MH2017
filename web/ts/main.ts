/// <reference path="pages/EditPlayerPage.ts"/>

var currentPage : Page;

$(document).ready(function docReady() {

    currentPage = new EditPlayerPage();

    document.title = "Safety Playbook - " + currentPage.getName() + " | MinneHack 2018";
    
});