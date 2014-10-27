
 
<HTML>
 <HEAD>
  <TITLE> Check Browser Language </TITLE>
  <META NAME="Generator" CONTENT="EditPlus">
  <META NAME="Author" CONTENT="">
  <META NAME="Keywords" CONTENT="">
  <META NAME="Description" CONTENT="">
   <script>
   function popupBrowserLang(){
   if(window.navigator.appName.toLowerCase()=="microsoft internet explorer"){
   alert("The language of your IE browser is: " + window.navigator.userLanguage)
   } else {
      alert("The language of your current browser is: " + window.navigator.language)
   }
   }

   </script>
 </HEAD>

 <BODY>
  <script>popupBrowserLang()</script>
 </BODY>
</HTML>

