/*
 * This file ("ITexture.java") is part of the RockBottomAPI by Ellpeck.
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

package de.ellpeck.rockbottom.api.assets;

import com.google.gson.JsonElement;

public interface ITexture extends IAsset{

    void draw(float x, float y);

    void draw(float x, float y, float scale);

    void draw(float x, float y, float width, float height);

    void draw(float x, float y, float width, float height, int[] light);

    void draw(float x, float y, float width, float height, int filter);

    void draw(float x, float y, float width, float height, int[] light, int filter);

    void draw(float x, float y, float x2, float y2, float srcX, float srcY, float srcX2, float srcY2);

    void draw(float x, float y, float x2, float y2, float srcX, float srcY, float srcX2, float srcY2, int[] light);

    void draw(float x, float y, float x2, float y2, float srcX, float srcY, float srcX2, float srcY2, int filter);

    void draw(float x, float y, float x2, float y2, float srcX, float srcY, float srcX2, float srcY2, int[] light, int filter);

    int getWidth();

    int getHeight();

    int getTextureColor(int x, int y);

    void setRotation(float angle);

    void setRotationCenter(float x, float y);

    JsonElement getAdditionalData(String name);

    ITexture copyAndFlip(boolean flipHor, boolean flipVert);

    ITexture getCopy();
}
