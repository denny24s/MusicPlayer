# **Work on project. Stage 1/5: Simple player layout**

## **Simple player layout**

## Description

In this project, you will create a simple song player. With this app, you will be able to play songs stored on your device, create playlists with your favorite songs and save them in the database so that they are not lost after closing the app.

You will also try to have some fun because why not.

Your resulting app, although simple, will have one outstanding pro: it will be yours, free of ads, free of subscriptions, and customizable by directly changing the source code.

In this initial stage, you will start focusing on the UI by preparing the layout structure of your `MainActivity`. You don't need to be concerned with fully implementing actions for most widgets. UX will be the focus of the following stage. Here, you will deal with adding the primary widgets you will be using and preparing the general look of the Activity.

## Objectives

1. Add a search button to the `MainActivity`.
    - id `mainButtonSearch`
    - text `search`
    - on click, show the message `no songs found`.
2. Add a `RecyclerView` to the `MainActivity`.
    - id `mainSongList`
    - just keep it empty for this stage
3. Add a `FragmentContainerView` to the `MainActivity`.
    - id `mainFragmentContainer`
    - `init` it with the `MainPlayerControllerFragment`
4. Create a `MainPlayerControllerFragment` that extends `Fragment`:
    - add a `TextView` with the id `controllerTvCurrentTime` and the text `"00:00"`;
    - add a `TextView` with the id `controllerTvTotalTime` and the text `"00:00"`;
    - add a `SeekBar` with the id `controllerSeekBar`;
    - add a `Button` with the id `controllerBtnPlayPause` with the text `"play/pause"`;
    - add a `Button` with the id `controllerBtnStop` with the text `"stop"`.
5. Create an [options menu](https://developer.android.com/develop/ui/views/components/menus#options-menu) with three `item` (Add Playlist, Load Playlist, Delete Playlist):
    - add the item Add Playlist, with the id `mainMenuAddPlaylist` and the title `"Add Playlist"`. On click, show the message `"no songs loaded, click search to load songs"`;
    - add the item Load Playlist, with the id `mainMenuLoadPlaylist` and the title `"Load Playlist"`. On click, show an `AlertDialog` with title `"choose playlist to load"`, and a negative button with the text `"cancel"` that does nothing;
    - add the item Delete Playlist, with the id `mainMenuDeletePlaylist` and the title `"Delete Playlist"`. On click, show an `AlertDialog` with title `"choose playlist to delete"` and a negative button with text `"cancel"` that does nothing;
    - use `import android.app.AlertDialog`, the AppCompat alternative version will fail.

obs: tests assume the existence of a file named "wisdom.mp3" on res/raw. It should be loaded automatically with the project, but if for some reason it goes missing use this link to restore it https://stepik.org/media/attachments/lesson/791917/wisdom.mp3
