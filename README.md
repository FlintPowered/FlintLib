FlintLib
========

FlintLib is a community continuation of CanaryLib.

Plugin Development
==================

Maven
-------------

        <dependency>
            <groupId>org.neptunepowered</groupId>
            <artifactId>FlintLib</artifactId>
            <version>1.0.0-SNAPSHOT</version>
        </dependency>


*Repository:*

        Coming soon...

Source Formatting and requirements
-------------

* No tabs; use 4 spaces instead.
* No trailing whitespaces.
* No CRLF line endings, LF only.
  * Git can handle this by auto-converting CRLF line endings into LF when you commit, and vice versa when it checks out code onto your filesystem.
    You can turn on this functionality with the core.autocrlf setting.
    If you’re on a Windows machine, set it to true — this converts LF endings into CRLF when you check out code. (git config --global core.autocrlf true)
  * Eclipse: http://stackoverflow.com/a/11596227/532590
  * NetBeans: http://stackoverflow.com/a/1866385/532590
  * IntelliJ: http://stackoverflow.com/a/9872584
* JavaDocs well written (as necessary)
* Matching how we format statements

        public class MyClass {
        
            public void function() {
                if (something) {
                    // do stuff
                } else if (somethingElse) {
                    // do other stuff
                } else {
                    // do else stuff
                }
            }
        }

Issues
-------

When reporting issues, be sure to include details on how to reproduce the issue and details on what the issue involves.  
Please do not report issues related to things that are part of the implementation of this library.  
(Those issues belong in CanaryModTeam/CanaryMod)  
If you are unsure if it belongs here or in the implementation, its probably an implementation issue and not a library issue  
(Most bugs are results of poor implementation or incorrect implementation)  
If you would like a feature added, feel free to open an issue describing the feature you would like added and how it could be useful.  

License
-------

Copyright &copy; 2012 - 2015, CanaryMod Team
Under the management of PlayBlack and Visual Illusions Entertainment  
All rights reserved.  
  
Redistribution and use in source and binary forms, with or without  
modification, are permitted provided that the following conditions are met:  
    * Redistributions of source code must retain the above copyright  
      notice, this list of conditions and the following disclaimer.  
    * Redistributions in binary form must reproduce the above copyright  
      notice, this list of conditions and the following disclaimer in the  
      documentation and/or other materials provided with the distribution.  
    * Neither the name of the FallenMoonNetwork/CanaryMod Team nor the  
      names of its contributors may be used to endorse or promote products  
      derived from this software without specific prior written permission.  
  
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND  
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED  
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE  
DISCLAIMED. IN NO EVENT SHALL CANARYMOD TEAM OR ITS CONTRIBUTORS BE LIABLE FOR ANY  
DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES  
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;  
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND  
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT  
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS  
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.  
  
Any source code from the Minecraft Server is not owned by CanaryMod Team, PlayBlack,  
Visual Illusions Entertainment, or its contributors and is not covered by above license.  
Usage of source code from the Minecraft Server is subject to the Minecraft End User License Agreement as set forth by Mojang AB.  
The Minecraft EULA can be viewed at https://account.mojang.com/documents/minecraft_eula  
CanaryMod Team, PlayBlack, Visual Illusions Entertainment, CanaryLib, CanaryMod, and its contributors  
are NOT affiliated with, endorsed, or sponsored by Mojang AB, makers of Minecraft.  
"Minecraft" is a trademark of Notch Development AB  
"CanaryMod" name is used with permission from FallenMoonNetwork.  
