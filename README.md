# Unsafe Blocks Plugin
This plugin adds the unsafe reserved6, info_update, and info_update2 blocks to your server so you can do /get and interact with them as normal blocks.

The usage of this plugin is not recommended, but you are free to use if you really want that blocks.

This plugin requires PowerNukkit 1.4.0.0+ to work

## Cloning and importing
1. Just do a normal `git clone https://github.com/PowerNukkit/UnsafeBlocksPlugin.git` (or the URL of your own git repository)
2. Import the `pom.xml` file with your IDE, it should do the rest by itself

## Debugging
1. Create a zip file containing only your `plugin.yml` file
2. Rename the zip file to change the extension to jar
3. Create an empty folder anywhere, that will be your server folder.  
   <small>_Note: You don't need to place the PowerNukkit jar in the folder, your IDE will load it from the maven classpath._</small>
4. Create a folder named `plugins` inside your server folder  
   <small>_Note: It is needed to bootstrap your plugin, your IDE will load your plugin classes from the classpath automatically,
   so it needs to have only the `plugin.yml` file._</small>
5. Move the jar file that contains only the `plugin.yml` to the `plugins` folder
6. Create a new Application run configuration setting the working directory to the server folder and the main class to:  `cn.nukkit.Nukkit`  
![](https://i.imgur.com/NUrrZab.png)
7. Now you can run in debug mode. If you change the `plugin.yml` you will need to update the jar file that you've made.
