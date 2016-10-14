﻿// Type definitions for phonegap-is-tablet v1.1.0
// Project: https://github.com/dpa99c/phonegap-istablet
// Definitions by: Dave Alden <https://github.com/dpa99c/>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped


interface Window {
    /**
     * Indicates whether the current device is a tablet or a phone.
     * @return {boolean} true if the device is a tablet; false if the device is a phone.
     */
	isTablet(): boolean;
}