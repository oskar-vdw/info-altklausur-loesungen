myArctan :: Double -> Double
myArctan x
    | x < -1 || x > 1 = error "Betrag von x mus <= 1 sein"
    | otherwise = loop 0.0 x

loop :: Double -> Double -> Double
loop k x
    | x < 0.00000001 = value k x
    | otherwise = value k x + loop (k+1.0) (value k x)

value :: Double -> Double -> Double
value k x = ((-1.0)**k) * (x**(2*k+1)) / (2*k+1)