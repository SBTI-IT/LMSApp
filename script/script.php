<?php

    $serverName = "";
    $username = "";
    $password = "";
    $dbname = "";

    try
    {
        // Create connection
        $mysql = new mysqli($serverName, $username, $password, $dbname);
    }
    catch(Exception $exception)
    {
        echo ("Connection failed: " . $exception);
    }

    try
    { 
        // Get action
        $action = $_POST['action'];
        // Determine action
        switch($action)
        {
            case "register":
                // SQL insert record
                break;
            case "login":
                // Login code
                break;
            case "addLeave":
                // Add leave application
                break;
            default:
                echo "Could not find action"; // If no action is found
            break;
        }
    }
    catch(Exception $exception)
    {
        echo $exception;
    }
?>
