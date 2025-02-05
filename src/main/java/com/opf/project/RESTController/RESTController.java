package com.opf.project.RESTController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RESTController {
    /**
     * It gets the details of the project
     * + Developer's registered email address
     * + The current datetime
     * + The GitHub URL of the project
     * @return details
     */
    @GetMapping("/project-details")
    public Map<String, String> getProjectDetails() {
        // A record to hold the details
        Map<String, String> details = new HashMap<>();

        // put "Your registered email" into the record
        details.put("email", "folaranmifisayo@gmail.com");

        // put "The current datetime" into the record
        Clock clock = Clock.systemUTC();
        ZonedDateTime time = ZonedDateTime.now(clock);
        details.put("current_datetime", time.toString());

        // put "The GitHub url" into the record
        details.put("github_url", "https://github.com/Oluwafisayomi-P-Folaranmi/hng-stage-0x01.git");

        return details;
    }
}
