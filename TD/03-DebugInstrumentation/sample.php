<?php
// Debugging Demo Script
echo "Starting Debugging Demo...\n";

// Intentional bug: Division by zero
function divide($a, $b) {
    if ($b === 0) {
        throw new Exception("Division by zero is not allowed.");
    }
    return $a / $b;
}

try {
    $numerator = 10;
    $denominator = 0; // Bug: This will cause an exception
    $result = divide($numerator, $denominator);

    echo "Result of division: $result\n";
} catch (Exception $e) {
    echo "Caught an exception: " . $e->getMessage() . "\n";
}

echo "Debugging Demo Completed.\n";