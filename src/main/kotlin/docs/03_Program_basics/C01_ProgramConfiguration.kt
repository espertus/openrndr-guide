@file:Suppress("UNUSED_EXPRESSION", "UNREACHABLE_CODE")
@file:Title("Program configuration")
@file:ParentTitle("Program basics")
@file:Order("110")
@file:URL("programBasics/programConfiguration")

package docs.`03_Program_basics`

import org.openrndr.Fullscreen
import org.openrndr.UnfocusBehaviour
import org.openrndr.application
import org.openrndr.dokgen.annotations.*
import org.openrndr.math.IntVector2

fun main() {

    @Text
    """
    # Program Configuration
    
    Starting your program with a custom configuration looks roughly like this.
    """

    @Code
    application {
        configure {

            // settings go here
        }
        program {
            // -- one time set up code goes here
            extend {

                // -- drawing code goes here
            }
        }
    }

    @Text
    """
    ## Window size
    
    Setting the window size is done through the `width` and `height` properties.
    """

    @Code
    application {
        configure {
            width = 640
            height = 480
        }
    }

    @Text
    """
    ## Window position
    
    The default value for `position` is `null` for which the default behaviour 
    is to place the window at the center of the primary display
    """

    @Code
    application {
        configure {
            position = IntVector2(100, 400)
        }
    }

    @Text
    """
    ## Fullscreen window

    Setting the window size is done through the `width` and `height` properties.

    """

    @Code
    application {
        configure {
            width = 1920
            height = 1080
            fullscreen = Fullscreen.SET_DISPLAY_MODE
        }
    }

    @Text
    """
    or if no mode change is desired use `Fullscreen.CURRENT_DISPLAY_MODE`
    """


    @Code
    application {
        configure {
            fullscreen = Fullscreen.CURRENT_DISPLAY_MODE
        }
    }

    @Text
    """
    # Window Title
    """

    @Code
    application {
        configure {
            title = "Lo and behold!"
        }
    }

    @Text 
    """
    # Window unfocus behaviour
    
    Two window unfocus behaviours are available. In `NORMAL` behaviour the 
    program continues running at full speed, in contrast the `THROTTLE` 
    behaviour throttles the program to 10Hz.
    """

    @Code
    application {
        configure {
            unfocusBehaviour = UnfocusBehaviour.THROTTLE
        }
    }
}
