"use strict";
var EditPlayerPage = (function () {
    function EditPlayerPage() {
    }
    EditPlayerPage.prototype.init = function () {
        return true;
    };
    EditPlayerPage.prototype.getName = function () {
        return "Edit Player";
    };
    EditPlayerPage.prototype.destroy = function () {
        return true;
    };
    return EditPlayerPage;
}());
var currentPage;
$(document).ready(function docReady() {
    currentPage = new EditPlayerPage();
    document.title = "Safety Playbook - " + currentPage.getName() + " | MinneHack 2018";
});
//# sourceMappingURL=main.js.map