$(function() {
    $(".extend-options").click(function () {
        if($(this).data("to-extend")) {
            var extendingClass = $(this).data("to-extend");
            $("." + extendingClass).slideToggle();
        }
    });

    $(".sidebar ul.menu").hover(function () {
        $("li").hover(function () {

        });
    });
});