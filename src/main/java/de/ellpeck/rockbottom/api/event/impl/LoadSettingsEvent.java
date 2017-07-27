/*
 * This file ("KeybindRegisterEvent.java") is part of the RockBottomAPI by Ellpeck.
 * View the source code at <https://github.com/Ellpeck/RockBottomAPI>.
 *
 * The RockBottomAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The RockBottomAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the RockBottomAPI. If not, see <http://www.gnu.org/licenses/>.
 */

package de.ellpeck.rockbottom.api.event.impl;

import de.ellpeck.rockbottom.api.data.settings.Settings;
import de.ellpeck.rockbottom.api.event.Event;

/**
 * This event is fired when {@link Settings} are loaded
 * <br> You should use this event to register your {@link de.ellpeck.rockbottom.api.data.settings.Keybind}s as doing it
 * later will make them not be loaded using the settings file
 * <br> This event is not cancellable.
 */
public class LoadSettingsEvent extends Event{

    public final Settings settings;

    public LoadSettingsEvent(Settings settings){
        this.settings = settings;
    }
}