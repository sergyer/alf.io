/**
 * This file is part of bagarino.
 *
 * bagarino is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * bagarino is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with bagarino.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.bagarino.manager.location;

import org.apache.commons.lang3.tuple.Pair;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.TimeZone;

@Component
@Profile("dev")
public class MockLocationManager implements LocationManager {
    @Override
    public Pair<String, String> geocode(String address) {
        return Pair.of("0", "0");
    }

    @Override
    public TimeZone getTimezone(Pair<String, String> location) {
        return getTimezone("", "");
    }

    @Override
    public TimeZone getTimezone(String latitude, String longitude) {
        return TimeZone.getDefault();
    }
}
