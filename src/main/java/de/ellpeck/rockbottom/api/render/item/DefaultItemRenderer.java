/*
 * This file ("DefaultItemRenderer.java") is part of the RockBottomAPI by Ellpeck.
 * View the source code at <https://github.com/RockBottomGame/>.
 * View information on the project at <https://rockbottom.ellpeck.de/>.
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
 *
 * © 2017 Ellpeck
 */

package de.ellpeck.rockbottom.api.render.item;

import com.google.gson.JsonElement;
import de.ellpeck.rockbottom.api.IGameInstance;
import de.ellpeck.rockbottom.api.IGraphics;
import de.ellpeck.rockbottom.api.assets.IAssetManager;
import de.ellpeck.rockbottom.api.entity.player.AbstractEntityPlayer;
import de.ellpeck.rockbottom.api.item.Item;
import de.ellpeck.rockbottom.api.item.ItemInstance;
import de.ellpeck.rockbottom.api.util.reg.IResourceName;

public class DefaultItemRenderer<T extends Item> implements IItemRenderer<T>{

    protected final IResourceName texture;

    public DefaultItemRenderer(IResourceName texture){
        this.texture = texture.addPrefix("items.");
    }

    @Override
    public void render(IGameInstance game, IAssetManager manager, IGraphics g, T item, ItemInstance instance, float x, float y, float scale, int filter){
        manager.getTexture(this.texture).draw(x, y, 1F*scale, 1F*scale, filter);
    }

    @Override
    public JsonElement getAdditionalTextureData(IGameInstance game, IAssetManager manager, IGraphics g, T item, ItemInstance instance, AbstractEntityPlayer player, String name){
        return manager.getTexture(this.texture).getAdditionalData(name);
    }
}
