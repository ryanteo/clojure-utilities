;Creates a string of special characters
(def special "\\#{'}${\"}/")
;A list of string definitions for the special characters
(def str-curlybraces-1 (str (get special 2)))          
(def str-curlybraces-2 (str (get special 4)))
(def str-hex (str (get special 1)))
(def str-single-quote (str (get special 3)))
(def str-dollar-sign (str (get special 5)))
(def str-backslash (str (get special 6)))
(def str-double-quote (str (get special 7)))