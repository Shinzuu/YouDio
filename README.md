# YouDio
simplified YouTube audio player / web scraper 
Jsoup for Web Scraping:

Jsoup is a Java library for working with real-world HTML. It is useful for web scraping and parsing HTML documents. In your case, you can use it to extract information, such as video links, from YouTube's search results.
JavaFX for UI:

JavaFX is a rich set of graphics and media packages that enables developers to design, create, test, debug, and deploy rich client applications that operate consistently across diverse platforms. It's a good choice for creating the user interface of your application.
JLayer for Audio Playback:

JLayer is a Java library for playing MP3 audio files. It provides a straightforward way to integrate audio playback functionality into your Java application.

BLOCK DIAGRAM
+---------------------------------+
|          User Interface          |
|  +---------------------------+  |
|  |        Search Bar        |  |
|  +---------------------------+  |
|                                 |
|  +---------------------------+  |
|  |       Playlist View      |  |
|  +---------------------------+  |
|                                 |
|  +---------------------------+  |
|  |      Playback Controls   |  |
|  +---------------------------+  |
+---------------------------------+
             |
             v
+---------------------------------+
|          Web Scraping            |
|  +---------------------------+  |
|  |   Jsoup (YouTube Search) |  |
|  +---------------------------+  |
+---------------------------------+
             |
             v
+---------------------------------+
|        Audio Playback           |
|  +---------------------------+  |
|  |        JLayer Library     |  |
|  +---------------------------+  |
+---------------------------------+
