/*
* Copyright 2011 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package demo.docexamples

import groovyx.javafx.GroovyFX
import groovyx.javafx.SceneGraphBuilder

GroovyFX.start({
    def sg = new SceneGraphBuilder();

    sg.stage(
        title: "Path Example (Groovy)",
        width: 400, height:250,
        visible: true,
    ){ 
        scene (fill: white) {
            path( translateX: 50, translateY: 50, stroke: red) {
                moveTo(x: 0, y: 0)
                cubicCurveTo(controlX1: -10, controlY1: 20,
                    controlX2: 80, controlY2: 100,
                x: 100, y: 50)
            }
        }
    }
});
