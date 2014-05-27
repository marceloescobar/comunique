/* Sidebar navigation */
/* ------------------ */

/* Show navigation when the width is greather than or equal to 991px */

$(document).ready(function(){

  $(window).resize(function()
  {
    if($(window).width() >= 767){
      $(".side-nav").slideDown(150);
    }     
	else{
	  $(".side-nav").slideUp(150);
	}	
  });

});

/* ****************************************** */
/* Sidebar dropdown */
/* ****************************************** */

$(document).ready(function(){
  $(".sidebar-dropdown a").on('click',function(e){
      e.preventDefault();

      if(!$(this).hasClass("open")) {
        // hide any open menus and remove all other classes
        $(".sidebar .side-nav").slideUp(150);
        $(".sidebar-dropdown a").removeClass("open");
        
        // open our new menu and add the open class
        $(".sidebar .side-nav").slideDown(150);
        $(this).addClass("open");
      }
      
      else if($(this).hasClass("open")) {
        $(this).removeClass("open");
        $(".sidebar .side-nav").slideUp(150);
      }
  });

});

/* ****************************************** */
/* Sidebar dropdown menu */
/* ****************************************** */

$(document).ready(function(){

  $(".has_submenu > a").click(function(e){
    e.preventDefault();
    var menu_li = $(this).parent("li");
    var menu_ul = $(this).next("ul");

    if(menu_li.hasClass("open")){
      menu_ul.slideUp(150);
      menu_li.removeClass("open");
	  $(this).find("span").removeClass("fa-caret-up").addClass("fa-caret-down");
    }
    else{
      $(".side-nav > li > ul").slideUp(150);
      $(".side-nav > li").removeClass("open");
      menu_ul.slideDown(150);
      menu_li.addClass("open");
	  $(this).find("span").removeClass("fa-caret-down").addClass("fa-caret-up");
    }
  });
  
});

/* ****************************************** */
/* Slim Scroll */
/* ****************************************** */

$(function(){
    $('.scroll').slimScroll({
        height: '315px',
		size: '5px',
		color:'rgba(50,50,50,0.3)'
    });
});	


/* ****************************************** */
/* JS for UI Tooltip */
/* ****************************************** */

$('.ui-tooltip').tooltip();

/* ****************** */
/* Date Time Picker JS */
/* ****************** */

$(function() {
	$('#datetimepicker1').datetimepicker({
		pickTime: false
	});
});

$(function() {
	$('#datetimepicker2').datetimepicker({
		pickDate: false
	});
});



/* ****************************************** */
/* Form Validate // Form Validation */
/* ****************************************** */

$.validator.setDefaults({
	submitHandler: function() { alert("submitted!"); }
});

$().ready(function() {

	// validate signup form on keyup and submit
	$("#signupForm").validate({
		rules: {
			firstname: "required",
			lastname: "required",
			username: {
				required: true,
				minlength: 2
			},
			password: {
				required: true,
				minlength: 5
			},
			confirm_password: {
				required: true,
				minlength: 5,
				equalTo: "#password"
			},
			email: {
				required: true,
				email: true
			},
			gender: {
				required: true
			},
			limit: {
				required: true
			},
			location: {
				required: true
			},
			agree: "required"
		},
		messages: {
			firstname: "Please enter your firstname",
			lastname: "Please enter your lastname",
			username: {
				required: "Please enter a username",
				minlength: "Your username must consist of at least 2 characters"
			},
			password: {
				required: "Please provide a password",
				minlength: "Your password must be at least 5 characters long"
			},
			confirm_password: {
				required: "Please provide a password",
				minlength: "Your password must be at least 5 characters long",
				equalTo: "Please enter the same password as above"
			},
			email: "Please enter a valid email address",
			gender: "Please choose gender",
			limit: "Please choose at least one option",
			location: "Please select your location",
			agree: "Please accept our policy"
		}
	});

});


/* ****************************************** */
/* Task widget */
/* ****************************************** */

$(document).ready(function(){   
   $('.tasks-widget input:checkbox').removeAttr('checked').on('click', function(){
      if(this.checked){
         $(this).next("span").css('text-decoration','line-through');
      }
      else{
         $(this).next("span").css('text-decoration','none');
      }
	});
});

/* ****************************************** */