# android_recyclerview

If your app needs to display a scrolling list of <b>elements based on large data sets (or data that frequently changes)</b>, you should use RecyclerView as described on this page.

The RecyclerView widget is a more <b>advanced and flexible version of ListView</b>.

In this project I have included two textview for each row and images you can see that is set background for layout.

<b>Steps to implement recyclerview is af follows:</b>

<b> 1. Gradle Scripts-build.gradle and inside dependencies </b><br>
      dependencies { 
               compile "com.android.support:recyclerview-v7:23.0.1“
       }<br><br>
<b> 2. Define Recyclerview in activity. </b><br><br>
<b> 3. Set Latyout to recyclerview </b><br>
Layout Manager is a very new concept introduced in RecyclerView for defining the type of Layout which RecyclerView should use.
     <br><br>
<b> 4. create a CustomAdapter class and extends RecyclerView.Adapter class with ViewHolder in it.</b><br>
<b>Output for following program is as follows :</b>
<div align="center">
    <img src="https://user-images.githubusercontent.com/35371687/46991877-5384b000-d125-11e8-879c-0c52245a6c06.png" width="400px"</img> 
</div>
