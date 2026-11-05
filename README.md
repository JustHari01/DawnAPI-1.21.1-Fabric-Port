# Dawn API — Unofficial Fabric 1.21.1 Port

A community compatibility port of [Dawn API](https://github.com/DawnTeamMC/DawnAPI), based on the upstream `v5.0.0` source for Minecraft 1.20.1. This repository targets Minecraft 1.21.1 with Fabric.

This is an unofficial project maintained by JustHari01. It is not an official Dawn Team release and is not affiliated with the Dawn Team.

## Port status

The port updates the source and dependencies for Minecraft 1.21.1 and keeps the upstream library and utility features in place. The Java sources compiled and the remapped Fabric JAR was created successfully. The mod has not yet been launched in Minecraft, so runtime stability is not confirmed. Treat this build as experimental.

## Build

- Minecraft: 1.21.1
- Loader: Fabric Loader 0.16.14 or newer
- Java: 21
- Fabric API: 0.116.17+1.21.1

Run `gradlew.bat remapJar` on Windows or `./gradlew remapJar` elsewhere. The distributable JAR is written under `build/libs/`.

## Upstream and license

- Upstream source and attribution: [DawnTeamMC/DawnAPI at v5.0.0](https://github.com/DawnTeamMC/DawnAPI/tree/v5.0.0)
- License: [GNU Lesser General Public License v3.0 only](LICENSE.md)

This port retains the upstream license and attribution. Changes in this repository are compatibility work for Minecraft 1.21.1; the upstream project remains the work of its original authors.

## AI assistance

AI assistance contributed substantially to adapting the code for Minecraft 1.21.1 and preparing this repository documentation. The upstream source and its authors are credited above.
