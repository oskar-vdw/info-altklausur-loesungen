mittelwert :: [Double] -> Double
mittelwert [] = error "keine leeren Listen du lutscher"
mittelwert xs = ((fromIntegral(length xs))**(-1.0))*(calculateM xs)

calculateM :: [Double] -> Double
calculateM (x:xs)
    | xs == [] = x
    | otherwise = x + calculateM xs

varianz :: [Double] -> Double
varianz xs = ((fromIntegral(length xs))**(-1.0)) * (calculateV xs (mittelwert xs))

calculateV :: [Double] -> Double -> Double
calculateV (x:xs) y
    | xs == [] = ((x-y)**fromIntegral(2))
    | otherwise = ((x-y)**fromIntegral(2)) + (calculateV xs y)