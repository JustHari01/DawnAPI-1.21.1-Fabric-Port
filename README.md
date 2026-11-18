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
- Exact source commit: `0fc156316f671adb1f0158c6d1b22f3218978fc8`
- License for that tagged snapshot: [GNU Lesser General Public License v3.0 only](LICENSE.md)

This port uses that exact tagged snapshot and its included LGPL license text. The current upstream project page may report different terms for later material; this repository makes no licensing claim about later upstream versions. Changes here are compatibility work for Minecraft 1.21.1. The upstream project remains the work of its original authors.

The port replaces the upstream logo with a separate icon made for this port.

## Bundled dependencies

The release JAR embeds Cloth Config Fabric, Cloth Basic Math, Terraform Shapes API, and Terraform Wood API. Their separate licenses and source links are listed in [THIRD-PARTY-NOTICES.md](THIRD-PARTY-NOTICES.md), and the license texts are included in the JAR under `META-INF/licenses/`.

## AI assistance

AI assistance contributed substantially to adapting the code for Minecraft 1.21.1 and preparing this repository documentation. The upstream source and its authors are credited above.