$(document).ready(function () {
    $(".expand-button").click(function () {
        $(this).find(".triangle-right").toggleClass("rotated");
        $(this).next(".expand-content").toggle();
    });
});
